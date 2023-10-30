/*
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.checkboxconfiguratortemplateservices.jalo;

import de.hybris.platform.checkboxconfiguratortemplateservices.constants.CheckboxconfiguratortemplateservicesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class CheckboxconfiguratortemplateservicesManager extends GeneratedCheckboxconfiguratortemplateservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( CheckboxconfiguratortemplateservicesManager.class.getName() );
	
	public static final CheckboxconfiguratortemplateservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CheckboxconfiguratortemplateservicesManager) em.getExtension(CheckboxconfiguratortemplateservicesConstants.EXTENSIONNAME);
	}
	
}
