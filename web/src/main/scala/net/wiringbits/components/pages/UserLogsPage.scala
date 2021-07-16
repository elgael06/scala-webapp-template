package net.wiringbits.components.pages

import net.wiringbits.API
import net.wiringbits.components.widgets._
import net.wiringbits.ui.components.core.widgets.Container.Alignment
import net.wiringbits.ui.components.core.widgets._
import slinky.core.FunctionalComponent
import slinky.core.annotations.react

@react object UserLogsPage {
    case class Props()
  
  val component: FunctionalComponent[Props] = FunctionalComponent[Props] { props =>
    Container(
      flex = Some(1),
      alignItems = Alignment.center,
      justifyContent = Alignment.center,
      child = UserLogsContent(name="logs")
    )
  }
}
