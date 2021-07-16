package net.wiringbits.components.widgets

import com.alexitc.materialui.facade.materialUiCore.mod.PropTypes.Color
import com.alexitc.materialui.facade.materialUiCore.{components => mui, materialUiCoreStrings => muiStrings}
import net.wiringbits.api.utils.Validator
import net.wiringbits.ui.components.core.ErrorLabel
import net.wiringbits.ui.components.core.widgets.Container.{Alignment, EdgeInsets}
import net.wiringbits.ui.components.core.widgets.{CircularLoader, Container, Title}
import net.wiringbits.{API, AppStrings}
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.FunctionalComponent
import slinky.core.annotations.react
import slinky.core.facade.{Fragment, Hooks}
import typings.reactRouterDom.{mod => reactRouterDom}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import org.scalajs.dom
import slinky.core.{FunctionalComponent, SyntheticEvent}
import slinky.web.html._

@react object UserLogsContent {
    case class Props(name:String)

    val component: FunctionalComponent[Props] = FunctionalComponent[Props] { props =>
    
        // here App Conteiner
        h3()(
            "este es el log de usuario."
        )
    }
}
