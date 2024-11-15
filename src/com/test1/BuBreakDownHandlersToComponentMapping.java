package com.test1;

public class BuBreakDownHandlersToComponentMapping {
	private Integer buBreakDownrComponentDefinition;
	private Integer buBreakDownHandlersId;
	private Integer objectInspector;
	private String department;
	private Integer baseReportingIndicator;
	private boolean buBreakDownHandlersMappedToReport;
	private boolean isActive;
	private String componentName;
	private String componentType;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BuBreakDownHandlersToComponentMapping() {

	}

	public BuBreakDownHandlersToComponentMapping(Integer buBreakDownrComponentDefinition, Integer buBreakDownHandlersId,
			Integer objectInspector, String department, Integer baseReportingIndicator,
			boolean buBreakDownHandlersMappedToReport, boolean isActive, String componentName, String componentType,
			String creationCr, String modifiedCr, String creationDate, String modifiedDate, String entityState) {
		super();
		this.buBreakDownrComponentDefinition = buBreakDownrComponentDefinition;
		this.buBreakDownHandlersId = buBreakDownHandlersId;
		this.objectInspector = objectInspector;
		this.department = department;
		this.baseReportingIndicator = baseReportingIndicator;
		this.buBreakDownHandlersMappedToReport = buBreakDownHandlersMappedToReport;
		this.isActive = isActive;
		this.componentName = componentName;
		this.componentType = componentType;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getBuBreakDownrComponentDefinition() {
		return buBreakDownrComponentDefinition;
	}

	public void setBuBreakDownrComponentDefinition(Integer buBreakDownrComponentDefinition) {
		this.buBreakDownrComponentDefinition = buBreakDownrComponentDefinition;
	}

	public Integer getBuBreakDownHandlersId() {
		return buBreakDownHandlersId;
	}

	public void setBuBreakDownHandlersId(Integer buBreakDownHandlersId) {
		this.buBreakDownHandlersId = buBreakDownHandlersId;
	}

	public Integer getObjectInspector() {
		return objectInspector;
	}

	public void setObjectInspector(Integer objectInspector) {
		this.objectInspector = objectInspector;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getBaseReportingIndicator() {
		return baseReportingIndicator;
	}

	public void setBaseReportingIndicator(Integer baseReportingIndicator) {
		this.baseReportingIndicator = baseReportingIndicator;
	}

	public boolean isBuBreakDownHandlersMappedToReport() {
		return buBreakDownHandlersMappedToReport;
	}

	public void setBuBreakDownHandlersMappedToReport(boolean buBreakDownHandlersMappedToReport) {
		this.buBreakDownHandlersMappedToReport = buBreakDownHandlersMappedToReport;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
