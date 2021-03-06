package it4bi.ufrt.ir.service.doc;

import java.util.ArrayList;
import java.util.List;

public class DocumentRecordResultRow {
	
	public DocumentRecordResultRow() {
		this.tags = new ArrayList<Tag>();
	}

	public DocumentRecordResultRow(DocumentRecord docRecord, float score) {
		this.docId = docRecord.getDocId();
		this.docTitle = docRecord.getDocTitle();
		this.mime = docRecord.getMime();
		this.tags = docRecord.getTags();
		this.score = score;
		this.updated = System.currentTimeMillis();
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getDocTitle() {
		return docTitle;
	}

	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}

	public boolean isLiked() {
		return isLiked;
	}

	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
		//this.score = this.score + this.score/15;
	}

	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public float getScore() {
		return score;
	}
	
	public void setScore(float score) {
		this.score = score;
	}

	private int docId;
	private String docTitle;
	private boolean isLiked = false;
	private boolean isOwned = false;
	private String mime;
	private List<Tag> tags;
	private float score;
	public long updated;
}
