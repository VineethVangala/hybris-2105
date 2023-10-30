/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.checkboxconfiguratortemplatefacades.setup;

import static de.hybris.platform.checkboxconfiguratortemplatefacades.constants.CheckboxconfiguratortemplatefacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.checkboxconfiguratortemplatefacades.constants.CheckboxconfiguratortemplatefacadesConstants;
import de.hybris.platform.checkboxconfiguratortemplatefacades.service.CheckboxconfiguratortemplatefacadesService;


@SystemSetup(extension = CheckboxconfiguratortemplatefacadesConstants.EXTENSIONNAME)
public class CheckboxconfiguratortemplatefacadesSystemSetup
{
	private final CheckboxconfiguratortemplatefacadesService checkboxconfiguratortemplatefacadesService;

	public CheckboxconfiguratortemplatefacadesSystemSetup(final CheckboxconfiguratortemplatefacadesService checkboxconfiguratortemplatefacadesService)
	{
		this.checkboxconfiguratortemplatefacadesService = checkboxconfiguratortemplatefacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		checkboxconfiguratortemplatefacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CheckboxconfiguratortemplatefacadesSystemSetup.class.getResourceAsStream("/checkboxconfiguratortemplatefacades/sap-hybris-platform.png");
	}
}
