/* Exporter.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/5/1 , Created by dennis
}}IS_NOTE

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zss.api;

import java.io.IOException;
import java.io.OutputStream;

import org.zkoss.zss.api.model.Book;
import org.zkoss.zss.api.model.Sheet;
import org.zkoss.zss.ui.Rect;

/**
 * Exporter for book, sheet
 * @author dennis
 * @since 3.0.0
 */
public interface Exporter {
	
	/**
	 * Export book
	 * @param book the book to export
	 * @param fos the output stream to store data
	 * @throws IOException
	 */
	public void export(Book book, OutputStream fos) throws IOException;
//	doesn't support to export sheet, selection until we find a good way in poi/html/pdf
//	/**
//	 * Export sheet
//	 * @param sheet the sheet to export
//	 * @param fos the output stream to store data
//	 * @throws IOException
//	 */
//	public void export(Sheet sheet, OutputStream fos) throws IOException;
//	/**
//	 * Export selection of sheet
//	 * @param sheet the sheet to export
//	 * @param selection the selection to export
//	 * @param fos the output stream to store data
//	 * @throws IOException
//	 */
//	public void export(Sheet sheet,Rect selection,OutputStream fos) throws IOException;

//  even html exporter doesn't support to disable heading yet
//	hide this before there has any implementation
//	/**
//	 * @return true if this exporter support heading configuration
//	 */
//	public boolean isSupportHeadings();
//	
//	/**
//	 * Sets heading configuration,
//	 * @param enable true to enable heading
//	 */
//	public void enableHeadings(boolean enable);
}
