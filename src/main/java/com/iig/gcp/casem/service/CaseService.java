package com.iig.gcp.casem.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iig.gcp.casem.dto.EmployeeDTO;
import com.iig.gcp.extraction.dto.ConnectionMaster;
import com.iig.gcp.feedlogging.dto.FeedLoggerDTO;

public interface CaseService {
	ArrayList<EmployeeDTO> getAlertsDetails() throws SQLException, Exception;
}
