package strings;
import java.util.ArrayList;
public class HardDriveDefinition {
	private String name;
	private ArrayList fileSizes;
	private double totalCap;
	private double freeSpace;
public HardDriveDefinition(String xName,ArrayList xFileSizes,double xTotalCap,double xFreeSpace){
	name=xName;
	fileSizes=xFileSizes;
	totalCap=xTotalCap;
	freeSpace=xFreeSpace;
	}

}
