import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
//	let greet = DataStore(context: NSObject()).log()

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}