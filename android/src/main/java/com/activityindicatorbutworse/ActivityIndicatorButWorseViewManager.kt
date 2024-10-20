package com.activityindicatorbutworse

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.ActivityIndicatorButWorseViewManagerInterface
import com.facebook.react.viewmanagers.ActivityIndicatorButWorseViewManagerDelegate

@ReactModule(name = ActivityIndicatorButWorseViewManager.NAME)
class ActivityIndicatorButWorseViewManager : SimpleViewManager<ActivityIndicatorButWorseView>(),
  ActivityIndicatorButWorseViewManagerInterface<ActivityIndicatorButWorseView> {
  private val mDelegate: ViewManagerDelegate<ActivityIndicatorButWorseView>

  init {
    mDelegate = ActivityIndicatorButWorseViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<ActivityIndicatorButWorseView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): ActivityIndicatorButWorseView {
    return ActivityIndicatorButWorseView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: ActivityIndicatorButWorseView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "ActivityIndicatorButWorseView"
  }
}
