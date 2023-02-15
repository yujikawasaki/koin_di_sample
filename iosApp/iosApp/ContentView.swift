import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
//	let greet = DataStore(context: NSObject()).log()

	var body: some View {
		//Text(greet)
		//Text(AppData().getData())

		// https://kotlinlang.org/docs/native-objc-interop.html#subclassing
		// https://stackoverflow.com/questions/69923611/implement-a-kotlin-interface-in-a-swift-class
		Text(DataRepository(appDataStore: AppData()).getData())
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

class AppData : IAppDataStore {
    func getData() -> String{
        return "from iOS platform"
    }
}