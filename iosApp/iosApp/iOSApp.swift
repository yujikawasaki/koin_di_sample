import SwiftUI
import shared

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}

	init(){

	    //setup Koin
	    DataModule.Companion().setupKoiniOS(context: NSObject())
	}
}