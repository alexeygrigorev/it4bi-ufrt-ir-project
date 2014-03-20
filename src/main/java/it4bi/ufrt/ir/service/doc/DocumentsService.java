package it4bi.ufrt.ir.service.doc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DocumentsService {

	public List<DocumentRecord> find(String query) {
		// here we implement everything
		return Arrays.asList(new DocumentRecord("Report A", "Disk D"), new DocumentRecord("Football Magazine", "Disk C"));
	}

}
