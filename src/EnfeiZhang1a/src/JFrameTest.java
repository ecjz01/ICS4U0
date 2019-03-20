/**
 * The JFrameTest2 class creates the application window, menu bar, containing a File menu option with a
 * Quit File menu item and a Help menu option with a Help Help menu item. It also ensures that the window
 * will close if the user clicks the 'x' button.
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.03.20
 * @author Enfei Zhang
 */

import javax.swing.*;

public class JFrameTest extends JFrame {
  /** This is the constructor for the JFrameTest2 class which creates a window containing a bar with 2 menu options.
   * Along with 2 menu options the window will close if you press the 'X'
   * The one that was already there is the File menu option, which contains a quit item.
   * What was added is the Help option on the bar along with a help menu item in it.
   */
  public JFrameTest() { 
    super ("JFrame Test");
    JMenuItem quitItem = new JMenuItem ("Quit");
    JMenuItem helpItem = new JMenuItem ("Help");
    JMenu fileMenu = new JMenu ("File");
    JMenu helpMenu = new JMenu ("Help");
    fileMenu.add (quitItem);
    helpMenu.add (helpItem);
    JMenuBar myMenus = new JMenuBar ();
    myMenus.add (fileMenu);
    myMenus.add (helpMenu);
    setJMenuBar (myMenus);
    setSize (400, 400);
    setVisible (true);
    setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);  }
}
