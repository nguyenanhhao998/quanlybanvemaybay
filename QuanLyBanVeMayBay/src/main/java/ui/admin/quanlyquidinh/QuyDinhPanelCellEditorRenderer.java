/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin.quanlyquidinh;

import ui.admin.quanlynhanvien.*;
import ui.admin.quanlycb.*;
import java.awt.Color;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HAO
 */
class QuyDinhPanelCellEditorRenderer extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {

    private static final long serialVersionUID = 1L;

    private QuyDinhCellTaskPane renderer = new QuyDinhCellTaskPane();
    private QuyDinhCellTaskPane editor = new QuyDinhCellTaskPane();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //renderer.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        return renderer;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        //editor.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        if (isSelected) {
            editor.setBackground(QuanLyQuyDinhPane.SELCECTED_COLOR);
        } else {
            Color color = row % 2 == 0 ? QuanLyQuyDinhPane.EVEN_COLOR : QuanLyQuyDinhPane.ODD_COLOR;
            editor.setBackground(color);
        }
        return editor;
    }

    @Override
    public Object getCellEditorValue() {
        return editor.toString();
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return false;
    }
}
