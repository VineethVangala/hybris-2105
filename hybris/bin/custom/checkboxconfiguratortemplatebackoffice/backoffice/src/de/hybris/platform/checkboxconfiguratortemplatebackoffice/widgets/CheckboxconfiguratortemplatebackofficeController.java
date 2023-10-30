/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved
 */
package de.hybris.platform.checkboxconfiguratortemplatebackoffice.widgets;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;

import com.hybris.cockpitng.util.DefaultWidgetController;

import de.hybris.platform.checkboxconfiguratortemplatebackoffice.services.CheckboxconfiguratortemplatebackofficeService;


public class CheckboxconfiguratortemplatebackofficeController extends DefaultWidgetController
{
	private static final long serialVersionUID = 1L;
	private Label label;

	@WireVariable
	private transient CheckboxconfiguratortemplatebackofficeService checkboxconfiguratortemplatebackofficeService;

	@Override
	public void initialize(final Component comp)
	{
		super.initialize(comp);
		label.setValue(checkboxconfiguratortemplatebackofficeService.getHello() + " CheckboxconfiguratortemplatebackofficeController");
	}
}
