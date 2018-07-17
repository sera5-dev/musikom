package com.sera5.musikom;

public enum ModelObject {

    MAIN(R.string.app_name, R.layout.page_main),
    PLAYLIST(R.string.app_name, R.layout.page_playlist);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
