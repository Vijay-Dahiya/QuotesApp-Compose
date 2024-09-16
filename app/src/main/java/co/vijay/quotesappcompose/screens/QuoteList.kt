package co.vijay.quotesappcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import co.vijay.quotesappcompose.models.Quote

@Composable
fun QuoteDetailsScreen(data : Array<Quote>, onClick : (quote : Quote) -> Unit) {
    LazyColumn {
        items(data) { quote ->
            QuoteListItem(quote, onClick)
        }
    }
}