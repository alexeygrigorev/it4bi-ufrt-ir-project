package it4bi.ufrt.ir.service.doc;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.MMapDirectory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;

public class DocumentRecord {

	private String docTitle;
	private String docPath;
	private int docId;
	private int uploaderId;
	private static int docIdCounter = 100000;

	public int getUploaderId() {
		return uploaderId;
	}

	public DocumentRecord() {
	}

	public String getDocTitle() {
		return docTitle;
	}
	
	public DocumentRecord(int docId, String docTitle, int uploderId) {
		this.docId = docId;
		this.docTitle = docTitle;
		this.uploaderId = uploaderId;
	}
	
	public DocumentRecord(String docTitle, int uploderId) {
		this.docId = docIdCounter++;
		this.docTitle = docTitle;
		this.uploaderId = uploaderId;
	}
	
	public DocumentRecord(String docTitle, String docPath, int uploaderId) {
		this.docId = docIdCounter++;
		this.docPath = docPath;
		this.docTitle = docTitle;
		this.uploaderId = uploaderId;
	}
	
	public String getFullText() {
		String docText = DocumentReader.readDoc(docPath);
		return docText;
	}
	
	public void index() throws Exception {  // Custom Exception Classes can be introduced
		
		if(docPath == null) throw new Exception();
		
		// configure index properties
        EnglishAnalyzer analyzer = new EnglishAnalyzer(Version.LUCENE_41);  
        Directory indexDir = new MMapDirectory(new File("./luceneIndex"));
      	
      	
        DocumentIndexer indexer = new DocumentIndexer(indexDir, analyzer);
        
        indexer.indexDocument(this);
		
	}
	
	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}

	public String getDocPath() {
		return docPath;
	}

	public void setDocPath() {
		
		DocumentsDAO docDAO = new DocumentsDAO();
		
		this.docPath = docDAO.getDocPath(this.docId);
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	

}
