package mpi.eudico.client.annotator.commands;

import mpi.eudico.client.annotator.ViewerManager2;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * DOCUMENT ME! $Id: PreviousScrollViewCA.java,v 1.1.1.1 2004/03/25 16:23:16
 * wouthuij Exp $
 *
 * @author $Author$
 * @version $Revision$
 */
public class PreviousScrollViewCA extends CommandAction {
    private Icon icon;

    /**
     * Creates a new PreviousScrollViewCA instance
     *
     * @param theVM DOCUMENT ME!
     */
    public PreviousScrollViewCA(ViewerManager2 theVM) {
        //super();
        super(theVM, ELANCommandFactory.PREVIOUS_SCROLLVIEW);

        icon = new ImageIcon(this.getClass().getResource("/mpi/eudico/client/annotator/resources/GoToPreviousScrollviewButton.gif"));
        putValue(SMALL_ICON, icon);

        putValue(Action.NAME, "");
    }

    /**
     * DOCUMENT ME!
     */
    @Override
	protected void newCommand() {
        command = ELANCommandFactory.createCommand(vm.getTranscription(),
                ELANCommandFactory.PREVIOUS_SCROLLVIEW);
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    @Override
	protected Object getReceiver() {
        return vm.getMasterMediaPlayer();
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    @Override
	protected Object[] getArguments() {
        Object[] args = new Object[1];
        args[0] = vm.getTimeScale();

        return args;
    }
}
