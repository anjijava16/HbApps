package com.iwinner.hb.test;

import com.iwinner.hb.dao.SelectOperationDaoImpl;
import com.iwinner.hb.dao.SelectOperationDaoImplTWO;
import com.iwinner.hb.dao.SelectionDaoImpl;
import com.iwinner.hb.dao.UpdateDaoImpl;

public class SelectOperationTest {
	public static void main(String[] args) {
		
		// For excecuteOperation
		SelectOperationDaoImpl.executeOperation();
		
		// For Select Deetails;
		SelectOperationDaoImpl.selectDetails();
		
		// For Testing puroses
		SelectOperationDaoImplTWO.verifyLoadAndGetOpertionDifference();
		
		
		// For Update Query
		UpdateDaoImpl.updateOperation();
		
		// For getOperation checking
		SelectionDaoImpl.getOperations();
		
		// For loadOperation checking
		SelectionDaoImpl.loadOperation();
		
	}
}
