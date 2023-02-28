package com.adobe.aem.shini.core.services.impl;

import org.osgi.service.component.annotations.Component;
import static com.adobe.aem.shini.core.constants.AppConstants.URL;
import com.adobe.aem.shini.core.services.ReadJsonService;
import com.adobe.aem.shini.core.utils.Network;

/**
 * @author Anirudh Sharma
 * 
 * Implementation of ReadJsonService
 */
@Component(immediate = true, service = ReadJsonService.class)
public class ReadJsonDataImpl implements ReadJsonService {


	/**
	 * Overridden method which will read the JSON data via an HTTP GET call
	 */
	@Override
	public String getData() {
		
		String response = Network.readJson(URL);
		
		return response;
	}

}