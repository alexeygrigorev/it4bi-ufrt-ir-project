package it4bi.ufrt.ir.service.dw.eval;

import it4bi.ufrt.ir.service.dw.eval.extractor.ExtractorInstantiator;
import it4bi.ufrt.ir.service.dw.eval.extractor.ParameterExtractor;
import it4bi.ufrt.ir.service.dw.ner.NamedEntity;
import it4bi.ufrt.ir.service.dw.ner.RecognizedNamedEntities;

import java.util.Collections;
import java.util.List;

// TODO consider renaming
public class EvalContext {

	private final String query;
	private final ExtractorInstantiator extractorInstantiator;
	private List<NamedEntity> namedEntities = Collections.emptyList();

	public EvalContext(String query, ExtractorInstantiator extractorInstantiator) {
		this.query = query;
		this.extractorInstantiator = extractorInstantiator;
	}

	public ParameterExtractor createExtractor(QueryParameter parameter) {
		return extractorInstantiator.instantiate(parameter);
	}

	public String getQuery() {
		return query;
	}

	public void setNamedEntities(List<NamedEntity> namedEntities) {
		this.namedEntities = namedEntities;
	}

	public RecognizedNamedEntities namedEntities() {
		return RecognizedNamedEntities.from(namedEntities);
	}

	public EvalResult createResultFor(QueryTemplate queryTemplate) {
		return new EvalResult(queryTemplate, namedEntities());
	}

}
