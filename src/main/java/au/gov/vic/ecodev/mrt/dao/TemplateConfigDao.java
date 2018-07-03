package au.gov.vic.ecodev.mrt.dao;

import java.util.Map;

public interface TemplateConfigDao {

	String getTemplateClasses(final String templateName);
	
	Map<String, Object> getOwnerEmailProperties(final String templateName);
}
