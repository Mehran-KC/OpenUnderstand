/*
GanttProject is an opensource project management tool. License: GPL3
Copyright (C) 2005-2011 Dmitry Barashev, GanttProject Team

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 3
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package net.sourceforge.ganttproject.action.edit;

import net.sourceforge.ganttproject.action.GPAction;
import net.sourceforge.ganttproject.gui.UIFacade;

import java.awt.event.ActionEvent;

public class RefreshViewAction extends GPAction {

  private UIFacade myUIFacade;

  public RefreshViewAction(UIFacade uiFacade) {
    super("refresh");
    myUIFacade = uiFacade;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (calledFromAppleScreenMenu(e)) {
      return;
    }
    myUIFacade.refresh();
  }

  @Override
  protected String getIconFilePrefix() {
    return "refresh_";
  }
}
