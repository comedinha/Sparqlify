package org.aksw.sparqlify.algebra.sql.nodes;

import org.aksw.sparqlify.core.sql.schema.Schema;

public abstract class SqlOpBase0
	extends SqlOpBase
{
	protected boolean isEmpty;
	
	/*
	public SqlOpBase0(Schema schema) {
		this(schema, false);
	}
	*/
	
	public SqlOpBase0(Schema schema, boolean isEmpty) {
		super(schema);
		this.isEmpty = isEmpty;
	}

	@Override
	public boolean isEmpty() {
		return isEmpty;
	}
}
