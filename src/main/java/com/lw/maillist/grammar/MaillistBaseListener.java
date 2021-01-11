// Generated from E:/Dev/Compile-work/Maillist/Maillist-backend/src/main/java\Maillist.g4 by ANTLR 4.9
package com.lw.maillist.grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
/**
 * This class provides an empty implementation of {@link MaillistListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MaillistBaseListener implements MaillistListener {

	//定义数据结构用来存放中间数据
	public List<MailBox> mailBoxes = new ArrayList<MailBox>();
	public MailBox mailBox = new MailBox();
	public List<String> mailAddress = new ArrayList<String>();
	public List<Boolean> isError = new ArrayList<Boolean>();
	public String userName;
	public String domain;
	public String finalMailList;
	public boolean localError;
	public boolean domainError;
	public boolean nodeError;
	//用于表示当前邮箱
	private int index;
	private boolean isFalse = false;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMaillist(MaillistParser.MaillistContext ctx) {
		MailBox mailBox = new MailBox();
		System.out.println(ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMaillist(MaillistParser.MaillistContext ctx) {
		finalMailList = ctx.getText();

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUMailBox(MaillistParser.UMailBoxContext ctx) {
		//每次进入时，说明到下一个邮箱地址了
		index++;
		localError = true;
		domainError = true;
		nodeError = false;
		System.out.println(index+"  "+ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUMailBox(MaillistParser.UMailBoxContext ctx) {

		if (nodeError||(domainError||localError)){
			isFalse = (!isFalse);
		}
		System.out.println("local: "+localError+" domain: "+domainError+" node: "+nodeError);

		mailBox.setMailAddress(ctx.getText());
		mailBox.setError(isFalse);
		mailBox.setUserName(userName);
		mailBox.setDomain(domain);
		mailBoxes.add(mailBox);

		mailBox = new MailBox();

		System.out.println("添加邮箱对象成功: "+ ctx.getText()+" isFalse: "+ isFalse);

		mailAddress.add(ctx.getText());
		isError.add(isFalse);
		isFalse = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterULocal_part(MaillistParser.ULocal_partContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitULocal_part(MaillistParser.ULocal_partContext ctx) {
		//用户地址合法，但尚未确定domain是否合法
		localError = false;
		userName = ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUDot_string(MaillistParser.UDot_stringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUDot_string(MaillistParser.UDot_stringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUAtom(MaillistParser.UAtomContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUAtom(MaillistParser.UAtomContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUDomain(MaillistParser.UDomainContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUDomain(MaillistParser.UDomainContext ctx) {
		//若退出domain区域，说明邮箱地址基本完整
		domainError = false;
		domain = ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSub_udomain(MaillistParser.Sub_udomainContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSub_udomain(MaillistParser.Sub_udomainContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) {
		nodeError = true;
		System.out.println("出错了！"+node.getText());
	}
}