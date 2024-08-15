package mx.edu.uttt.mvvm_pattern.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//Clase que se encarga de heredar de ViewModel nativo de kotlin
class ContadorViewModel : ViewModel() {
    //delclaramos una variable del tipo priavada para que nadie pueda modificar su valor, de forma externa
    private val _contador = mutableStateOf(0)

    //se declara esta variable copia para poder ser modificada, la varible _contador es la varible que
    // se va a manipular dentro de la clase ContadorViewModel
    val contador: State<Int> get() = _contador

    fun Add(){
        _contador.value = _contador.value+1
    }

    var conta = mutableStateOf(0)
}