package au.gov.vic.ecodev.mrt.dao;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import au.gov.vic.ecodev.mrt.common.db.Constants.Strings;

@Repository
public class TemplateConfigDaoImpl implements TemplateConfigDao {

	private static final Logger LOGGER = Logger.getLogger(TemplateConfigDaoImpl.class);

	private static final String SELECT_OWNER_EMAIL_SQL = "SELECT OWNER_EMAILS, EMAILS_BUILDER FROM TEMPLATE_CONFIG WHERE TEMPLATE_NAME = ?";

	private static final String SELECT_TEMPLATE_CLASS_SQL = "select class_names from template_config where template_name = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String getTemplateClasses(String templateName) {
		String classes = Strings.EMPTY;
		try {
			classes = jdbcTemplate.queryForObject(SELECT_TEMPLATE_CLASS_SQL,
					new Object[] { templateName.toUpperCase() }, String.class);
		} catch (EmptyResultDataAccessException e) {
			LOGGER.warn("No template class found for template: " + templateName, e);
		}
		return classes;
	}

	@Override
	public Map<String, Object> getOwnerEmailProperties(String templateName) {
		Map<String, Object> templateEmailProperties = null;
		try {
			templateEmailProperties = jdbcTemplate.queryForMap(SELECT_OWNER_EMAIL_SQL, 
					new Object[] { templateName.toUpperCase() });
		} catch (EmptyResultDataAccessException e) {
			LOGGER.warn("No template class found for template: " + templateName, e);
		}
		return templateEmailProperties;
	}

}
