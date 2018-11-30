package pdf.kit.component.chart.model;

import lombok.Data;

/**
 * Created by fgm on 2017/4/7.
 */
@Data
public class XYLine {
    private double yvalue;
    private String  xvalue;
    private String groupName;
    
    public XYLine(){

    }
    
	public XYLine(double yvalue, String xvalue, String groupName) {
		super();
		this.yvalue = yvalue;
		this.xvalue = xvalue;
		this.groupName = groupName;
	}

	public double getYvalue() {
		return yvalue;
	}

	public void setYvalue(double yvalue) {
		this.yvalue = yvalue;
	}

	public String getXvalue() {
		return xvalue;
	}

	public void setXvalue(String xvalue) {
		this.xvalue = xvalue;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
