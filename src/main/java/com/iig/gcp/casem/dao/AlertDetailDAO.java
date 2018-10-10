package com.iig.gcp.casem.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iig.gcp.casem.dto.EmployeeDTO;
import com.iig.gcp.feedlogging.dto.FeedLoggerDTO;

public interface AlertDetailDAO {
	public ArrayList<EmployeeDTO> getAlertsDetails() throws SQLException, Exception;
}
