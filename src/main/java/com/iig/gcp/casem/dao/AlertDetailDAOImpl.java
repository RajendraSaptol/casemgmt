package com.iig.gcp.casem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.iig.gcp.casem.dto.EmployeeDTO;
import com.iig.gcp.feedlogging.dto.FeedLoggerDTO;
import com.iig.gcp.utils.ConnectionUtils;

@Component
public class AlertDetailDAOImpl implements AlertDetailDAO{
	@Override
	public ArrayList<EmployeeDTO> getAlertsDetails() throws SQLException, Exception {
		ArrayList<EmployeeDTO> arr = new ArrayList<EmployeeDTO>();
		Connection connection = null;
		try {
			connection = ConnectionUtils.getConnectionCase();
			PreparedStatement pstm = connection.prepareStatement("select * from employee");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				EmployeeDTO employee=new EmployeeDTO();
				employee.setAlertId(rs.getString(1));
				employee.setEmployeeId(rs.getString(2));
				employee.setEmployeeName(rs.getString(3));
				employee.setExpenseAmount(rs.getString(4));
				employee.setDateGE(rs.getString(5));
				employee.setPublicOfficial(rs.getString(6));
				employee.setExpenseReportId(rs.getString(7));
				employee.setJustification(rs.getString(8));
				employee.setCostCentreCode(rs.getString(9));
				employee.setAuthorisingManager(rs.getString(10));
				employee.setAttendeeStaffId(rs.getString(11));
				employee.setAttendeeFullName(rs.getString(12));
				employee.setStatus(rs.getString(13));
				employee.setPriority(rs.getString(14));
				employee.setTimestamp(rs.getString(15));
				arr.add(employee);
			}
			/*for(int i = 0; i < arr.size(); i++)
		    {
		        System.out.println("Alert Data for all alert: "+arr.get (i)); 
		    }*/
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		ConnectionUtils.closeQuietly(connection);
		return arr;
	}

}
