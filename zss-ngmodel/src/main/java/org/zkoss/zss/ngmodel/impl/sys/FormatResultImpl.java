package org.zkoss.zss.ngmodel.impl.sys;

import java.text.Format;

import org.zkoss.poi.ss.format.CellFormatResult;
import org.zkoss.zss.ngmodel.NColor;
import org.zkoss.zss.ngmodel.NRichText;
import org.zkoss.zss.ngmodel.impl.ColorImpl;
import org.zkoss.zss.ngmodel.sys.format.FormatResult;

public class FormatResultImpl implements FormatResult {
	
	private String text;
	private NColor textColor;//it is possible no format result color
	private NRichText richText;
	private boolean dateFormatted = false;
	private Format formater;
	public FormatResultImpl(NRichText richText){
		this.richText = richText;
	}
	public FormatResultImpl(CellFormatResult result, Format formater, boolean dateFormatted){
		this.text = result.text;
		if (result.textColor != null){
			this.textColor = new ColorImpl((byte)result.textColor.getRed(),(byte)result.textColor.getGreen(),
					(byte)result.textColor.getBlue());
		}
		this.formater = formater;
		this.dateFormatted = dateFormatted;
	}
	public FormatResultImpl(String text, NColor color){
		this.text = text;
		this.textColor = color;
	}
	
	@Override
	public Format getFormater(){
		return formater;
	}
	
	@Override
	public String getText() {
		return richText==null?text:richText.getText();
	}

	@Override
	public NColor getColor() {
		return richText==null?textColor:richText.getFont().getColor();
	}
	@Override
	public boolean isRichText() {
		return richText!=null;
	}
	@Override
	public NRichText getRichText() {
		return richText;
	}
	@Override
	public boolean isDateFormatted() {
		return dateFormatted;
	}


}
