// Generated from E:/Dev/Compile-work/Maillist/Maillist-backend/src/main/java\Maillist.g4 by ANTLR 4.9
package com.lw.maillist.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MaillistParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MaillistVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MaillistParser#maillist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaillist(MaillistParser.MaillistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaillistParser#uMailBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUMailBox(MaillistParser.UMailBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaillistParser#uLocal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitULocal_part(MaillistParser.ULocal_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaillistParser#uDot_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUDot_string(MaillistParser.UDot_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaillistParser#uAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUAtom(MaillistParser.UAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaillistParser#uDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUDomain(MaillistParser.UDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaillistParser#sub_udomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_udomain(MaillistParser.Sub_udomainContext ctx);
}