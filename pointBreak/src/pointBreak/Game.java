package pointBreak;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class Game extends ApplicationWindow {
	private Text playerInput;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Create the application window.
	 */
	public Game() 
	{
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) 
	{
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(null);
		{
			Label inputMessage = new Label(container, SWT.NONE);
			inputMessage.setBounds(40, 35, 584, 38);
			inputMessage.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
			inputMessage.setText("Input a number between 1 and 14 for a preset: ");
		}
		{
			playerInput = new Text(container, SWT.BORDER);
			playerInput.setBounds(40, 77, 80, 31);
		}
		{
			Button goBtn = new Button(container, SWT.NONE);
			goBtn.setBounds(186, 140, 373, 35);
			goBtn.addMouseListener(new MouseAdapter() 
			{
				@Override
				public void mouseDown(MouseEvent e) 
				{
					Character testGirl = new Character();
					testGirl.healthCalc();
					int inputActual = Integer.parseInt(playerInput.getText());
					testGirl.preset(inputActual);
				}
			});
			goBtn.setText("Go");
		}
		{
			Label lblclickGoOnce = new Label(container, SWT.NONE);
			lblclickGoOnce.setBounds(40, 370, 519, 30);
			lblclickGoOnce.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
			lblclickGoOnce.setText("(Click go once you have entered your preset number)");
		}
		{
			Button btnNext = new Button(container, SWT.NONE);
			btnNext.setBounds(670, 397, 72, 35);
			btnNext.setText("Next ->");
		}

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() 
	{
		// Create the actions
	}

	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() 
	{
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager.
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(int style) 
	{
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() 
	{
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) 
	{
		try 
		{
			Game window = new Game();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) 
	{
		super.configureShell(newShell);
		newShell.setText("Point Break");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() 
	{
		return new Point(800, 600);
	}
}
