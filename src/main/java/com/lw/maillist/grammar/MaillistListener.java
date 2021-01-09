// Generated from E:/Dev/Compile-work/Maillist/Maillist-backend/src/main/java\Maillist.g4 by ANTLR 4.9
package com.lw.maillist.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaillistParser}.
 */
public interface MaillistListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MaillistParser#maillist}.
	 * @param ctx the parse tree
	 */
	void enterMaillist(MaillistParser.MaillistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#maillist}.
	 * @param ctx the parse tree
	 */
	void exitMaillist(MaillistParser.MaillistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaillistParser#uMailBox}.
	 * @param ctx the parse tree
	 */
	void enterUMailBox(MaillistParser.UMailBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#uMailBox}.
	 * @param ctx the parse tree
	 */
	void exitUMailBox(MaillistParser.UMailBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaillistParser#uLocal_part}.
	 * @param ctx the parse tree
	 */
	void enterULocal_part(MaillistParser.ULocal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#uLocal_part}.
	 * @param ctx the parse tree
	 */
	void exitULocal_part(MaillistParser.ULocal_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaillistParser#uDot_string}.
	 * @param ctx the parse tree
	 */
	void enterUDot_string(MaillistParser.UDot_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#uDot_string}.
	 * @param ctx the parse tree
	 */
	void exitUDot_string(MaillistParser.UDot_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaillistParser#uAtom}.
	 * @param ctx the parse tree
	 */
	void enterUAtom(MaillistParser.UAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#uAtom}.
	 * @param ctx the parse tree
	 */
	void exitUAtom(MaillistParser.UAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaillistParser#uDomain}.
	 * @param ctx the parse tree
	 */
	void enterUDomain(MaillistParser.UDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#uDomain}.
	 * @param ctx the parse tree
	 */
	void exitUDomain(MaillistParser.UDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaillistParser#sub_udomain}.
	 * @param ctx the parse tree
	 */
	void enterSub_udomain(MaillistParser.Sub_udomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaillistParser#sub_udomain}.
	 * @param ctx the parse tree
	 */
	void exitSub_udomain(MaillistParser.Sub_udomainContext ctx);
}