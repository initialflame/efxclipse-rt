package org.eclipse.fx.code.editor.langs.codegen.fx.lua;

public class LuaPresentationReconciler extends org.eclipse.fx.text.ui.presentation.PresentationReconciler {
	public LuaPresentationReconciler() {
		org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer __dftl_partition_content_typeDamageRepairer = new org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer(new Lua__dftl_partition_content_type());
		setDamager(__dftl_partition_content_typeDamageRepairer, "__dftl_partition_content_type");
		setRepairer(__dftl_partition_content_typeDamageRepairer, "__dftl_partition_content_type");
		org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer __lua_single_line_commentDamageRepairer = new org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer(new Lua__lua_single_line_comment());
		setDamager(__lua_single_line_commentDamageRepairer, "__lua_single_line_comment");
		setRepairer(__lua_single_line_commentDamageRepairer, "__lua_single_line_comment");
		org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer __lua_multi_line_commentDamageRepairer = new org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer(new Lua__lua_multi_line_comment());
		setDamager(__lua_multi_line_commentDamageRepairer, "__lua_multi_line_comment");
		setRepairer(__lua_multi_line_commentDamageRepairer, "__lua_multi_line_comment");
		org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer __lua_stringDamageRepairer = new org.eclipse.fx.text.ui.rules.DefaultDamagerRepairer(new Lua__lua_string());
		setDamager(__lua_stringDamageRepairer, "__lua_string");
		setRepairer(__lua_stringDamageRepairer, "__lua_string");
	}
}