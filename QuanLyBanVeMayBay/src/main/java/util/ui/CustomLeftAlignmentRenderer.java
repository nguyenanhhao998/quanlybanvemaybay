/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author HAO
 */
public class CustomLeftAlignmentRenderer extends JPanel implements TableCellRenderer {

    JLabel label;

    public CustomLeftAlignmentRenderer() {
        setLayout(new BorderLayout());

        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 16));
        label.setHorizontalAlignment(JLabel.LEFT);

        add(label, BorderLayout.CENTER);
        JPanel filter1 = new JPanel();
        filter1.setPreferredSize(new Dimension(25, 0));
        filter1.setOpaque(false);

        JPanel filter2 = new JPanel();
        filter2.setPreferredSize(new Dimension(25, 0));
        filter2.setOpaque(false);

        add(filter1, BorderLayout.WEST);
        add(filter2, BorderLayout.EAST);
        //setOpaque(false);
        //setPreferredSize(new Dimension(200, 40));
        //setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        label.setText(value.toString());
        return this;
    }

}
