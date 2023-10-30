/*
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.checkboxconfiguratortemplatefacades.jalo;

import de.hybris.platform.checkboxconfiguratortemplatefacades.constants.CheckboxconfiguratortemplatefacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class CheckboxconfiguratortemplatefacadesManager extends GeneratedCheckboxconfiguratortemplatefacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( CheckboxconfiguratortemplatefacadesManager.class.getName() );
	
	public static final CheckboxconfiguratortemplatefacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CheckboxconfiguratortemplatefacadesManager) em.getExtension(CheckboxconfiguratortemplatefacadesConstants.EXTENSIONNAME);
	}
	
}
