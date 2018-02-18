package app;

import ui.treeview.TreePanel;
import ui.treeview.TreeView;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class TreeController extends Controller
{
    protected Point lastMovedPoint;

    /**
     * TreeController Constructor - creates a controller object to listen
     * to ui events from a TreePanel
     */
    public TreeController()
    {
        super();
    }

    /**
     * Mouse Clicked event - no default action
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    /**
     * Mouse Pressed event - sets the cursor to the move cursor and stores
     * info for possible panning
     *
     * @param e MouseEvent object
     */
    @Override
    public void mousePressed(MouseEvent e)
    {
        super.mousePressed(e);
    }

    /**
     * Mouse Released event - sets the cursor back to the default cursor and reset
     * info for panning
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseReleased(MouseEvent e)
    {
        super.mouseReleased(e);

        if(e.getButton() == MouseEvent.BUTTON1)
        {
            lastMovedPoint = e.getPoint();
            if(e.isControlDown())
            {
                //((TreeView)viewer).toggleSelection();
            }
        }
    }

    /**
     * Mouse Entered event - no default action
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    /**
     * Mouse Exited event - no default action
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseExited(MouseEvent e)
    {

    }

    /**
     * Mouse Dragged event - adjusts the viewport
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseDragged(MouseEvent e)
    {
        super.mouseDragged(e);
    }

    /**
     * Mouse Moved event - no default action
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseMoved(MouseEvent e)
    {

    }

    /**
     * Mouse Wheel Moved event - zooms in on the viewport
     *
     * @param e MouseEvent object
     */
    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        super.mouseWheelMoved(e);
    }
}