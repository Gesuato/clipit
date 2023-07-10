import SwiftUI
import FirebaseCore
import shared

class AppDelegate: NSObject, UIApplicationDelegate {
   func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
     FirebaseApp.configure()

     return true
   }
}

@main
struct YourApp: App {
   @UIApplicationDelegateAdaptor(AppDelegate.self) var delegate

    init() {
        InjectionFactoryKt.doInitKoin()
    }
    
    var body: some Scene {
		WindowGroup {
		    ZStack {
		        Color.white.ignoresSafeArea(.all) // status bar color
			    ContentView()
			}.preferredColorScheme(.light)
		}
	}
}
