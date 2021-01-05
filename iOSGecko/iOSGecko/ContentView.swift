//
//  ContentView.swift
//  iOSGecko
//
//  Created by Cameron Webb on 1/4/21.
//

import SwiftUI
import shared


struct ContentView: View {
    @State var item: String = ""

    var body: some View {
        Text(self.item)
            .padding()
            .onAppear {
                CoinGeckoApi().coinsMarket { (data, error) in
                    guard let data = data, error == nil else {
                        print(error)
                        return
                    }
                    
                    let name = data.first?.name ?? "Who knows"
                    let price = data.first?.current_price ?? 0.0
                    let priceInfo = "\(name): \(price)"
                    self.item = priceInfo
                }
            }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
