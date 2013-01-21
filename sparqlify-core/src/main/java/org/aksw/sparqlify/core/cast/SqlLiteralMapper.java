package org.aksw.sparqlify.core.cast;

import com.hp.hpl.jena.sparql.expr.NodeValue;

/**
 * TODO Rename to SqlDatatype
 * 
 * Class for converting NodeValues to Sql Objects and vice versa
 * 
 * 
 * @author Claus Stadler <cstadler@informatik.uni-leipzig.de>
 *
 */
public interface SqlLiteralMapper {
	//String serialize(NodeValue value);
	String serialize(SqlValue value);
}