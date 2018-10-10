package com.iig.gcp.casem.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iig.gcp.casem.dao.AlertDetailDAO;
import com.iig.gcp.casem.dao.AlertDetailDAOImpl;
import com.iig.gcp.casem.dto.EmployeeDTO;
import com.iig.gcp.constants.MySqlConstants;
import com.iig.gcp.extraction.dto.ConnectionMaster;
import com.iig.gcp.feedlogging.dao.FeedLoggerDAOImpl;
import com.iig.gcp.feedlogging.dto.FeedLoggerDTO;
import com.iig.gcp.hipdashboard.dao.HipDAO;
import com.iig.gcp.utils.ConnectionUtils;

@Service
public class CaseServiceImpl implements CaseService {
	@Autowired
	AlertDetailDAO alertDetailDAO;
	
	@Override
	public ArrayList<EmployeeDTO> getAlertsDetails() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return alertDetailDAO.getAlertsDetails();
	
	}
	
	
}
