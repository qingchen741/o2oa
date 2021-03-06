package com.x.report.assemble.control.jaxrs.workprog.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionSaveWorkProg extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionSaveWorkProg( Throwable e ) {
		super("系统在保存汇报工作完成情况信息内容时发生异常。", e );
	}
}
