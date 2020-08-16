/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author HAO
 */
class CustomCenterAlignmentRenderer extends JLabel implements TableCellRenderer {

    public CustomCenterAlignmentRenderer() {
        setForeground(new Color(255, 255, 255));
        setBackground(new Color(18, 18, 18));
        setFont(new java.awt.Font("Tahoma", 0, 18));
        setHorizontalAlignment(CENTER);
        setOpaque(true);
        setPreferredSize(new Dimension(200, 50));
        //setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102), 1));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        return this;
    }

}
