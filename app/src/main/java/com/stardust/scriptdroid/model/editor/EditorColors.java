
package com.stardust.scriptdroid.model.editor;


import com.google.gson.annotations.SerializedName;

public class EditorColors {

    @SerializedName("editor.background")
    private String mEditorBackground;
    @SerializedName("editor.foreground")
    private String mEditorForeground;
    @SerializedName("editor.inactiveSelectionBackground")
    private String mEditorInactiveSelectionBackground;
    @SerializedName("lineNumber.foreground")
    private String mLineNumberForeground;
    @SerializedName("editor.selectionHighlightBackground")
    private String mEditorSelectionHighlightBackground;
    @SerializedName("imeBar.background")
    private String mImeBackgroundColor;
    @SerializedName("imeBar.foreground")
    private String mImeForegroundColor;

    public String getEditorBackground() {
        return mEditorBackground;
    }

    public void setEditorBackground(String editorBackground) {
        mEditorBackground = editorBackground;
    }

    public String getEditorForeground() {
        return mEditorForeground;
    }

    public void setEditorForeground(String editorForeground) {
        mEditorForeground = editorForeground;
    }

    public String getEditorInactiveSelectionBackground() {
        return mEditorInactiveSelectionBackground;
    }

    public void setEditorInactiveSelectionBackground(String editorInactiveSelectionBackground) {
        mEditorInactiveSelectionBackground = editorInactiveSelectionBackground;
    }

    public String getLineNumberForeground() {
        return mLineNumberForeground;
    }

    public void setLineNumberForeground(String lineNumberForeground) {
        mLineNumberForeground = lineNumberForeground;
    }

    public String getEditorSelectionHighlightBackground() {
        return mEditorSelectionHighlightBackground;
    }

    public void setEditorSelectionHighlightBackground(String editorSelectionHighlightBackground) {
        mEditorSelectionHighlightBackground = editorSelectionHighlightBackground;
    }

    public String getImeBackgroundColor() {
        return mImeBackgroundColor;
    }

    public void setImeBackgroundColor(String imeBackgroundColor) {
        mImeBackgroundColor = imeBackgroundColor;
    }

    public String getImeForegroundColor() {
        return mImeForegroundColor;
    }

    public void setImeForegroundColor(String imeForegroundColor) {
        mImeForegroundColor = imeForegroundColor;
    }
}
