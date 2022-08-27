package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString 
{

	public static void main(String[] args) throws Exception {
	

		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		
		String path="D:\\25th_0ct_2021_5PM\\Project_196\\src\\other_package";
		
		//Copy String and add to clipboard
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
	}

}
