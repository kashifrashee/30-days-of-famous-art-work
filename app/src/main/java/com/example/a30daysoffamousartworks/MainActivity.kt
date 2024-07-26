package com.example.a30daysoffamousartworks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysoffamousartworks.data.ArtGallery
import com.example.a30daysoffamousartworks.data.artGalleryList
import com.example.a30daysoffamousartworks.ui.theme._30DaysOfFamousArtworksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfFamousArtworksTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtworkApp(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(dimensionResource(id = R.dimen.padding_medium))
                    )
                }
            }
        }
    }
}

@Composable
fun ArtworkApp(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            ArtWorkTopAppBar()
        }
    ) {
        LazyColumn(contentPadding = it) {
            items(artGalleryList){
                ArtworkItem(
                    artGallery = it,
                    modifier = Modifier
                )
        }
    }
}

}

@Composable
fun ArtworkItem(
    modifier: Modifier = Modifier,
    artGallery: ArtGallery
){
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 15.dp
        ),
        modifier = modifier
            .padding(dimensionResource(R.dimen.padding_small))
            .clickable(
                onClick = { expanded = !expanded }
            )
            .fillMaxSize(),

    ){
        Column(
            modifier = Modifier,
                //.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            ArtworkImageWithDayTitle(
                numberOfDay = artGallery.numberOfDay,
                artworkTitle =  artGallery.imageTitleResId,
                artworkImage = artGallery.imageResId
            )
            Spacer(modifier = Modifier.weight(1f))
            if (expanded){
                ArtworkDetail(
                    artworkTitle = artGallery.imageTitleResId,
                    artworkDescription = artGallery.imageDescriptionResId,
                    artworkType =  artGallery.workTypeResId,
                    artworkDate = artGallery.dateResId,
                    artworkCulture = artGallery.cultureResId
                )
            }
        }
    }

}

@Composable
fun ArtworkImageWithDayTitle(
    modifier: Modifier = Modifier,
    numberOfDay: Int,
    @StringRes artworkTitle: Int,
    @DrawableRes artworkImage: Int,

){
    Box(){
        Column(
            modifier = modifier,
            //horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.number_of_days, numberOfDay),
                style = MaterialTheme.typography.displayMedium
            )
            Text(
                text = stringResource(id = artworkTitle),
                style = MaterialTheme.typography.bodyLarge
            )
            Image(
                painter = painterResource(id = artworkImage),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.image_size)),
                alignment = Alignment.Center,
                contentScale = ContentScale.Fit
            )
        }

    }
}

@Composable
fun ArtworkDetail(
    modifier: Modifier = Modifier,
    @StringRes artworkTitle: Int,
    @StringRes artworkDescription: Int,
    @StringRes artworkType: Int,
    @StringRes artworkDate: Int,
    @StringRes artworkCulture: Int,
){
    Column(

        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
    ) {
        Text(
            text = stringResource(id = artworkTitle),
            style = MaterialTheme.typography.displayMedium
        )
        Text(
            text = stringResource(id = artworkDescription),
            style = MaterialTheme.typography.bodyLarge
        )

        Row {
            Text(
                text = "Classification: ",
                style = MaterialTheme.typography.displayMedium
            )
            Text(
                text = stringResource(id = artworkType),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Row {
            Text(
                text = "Date: ",
                style = MaterialTheme.typography.displayMedium
            )
            Text(
                text = stringResource(id = artworkDate),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Row {
            Text(
                text = "Culture: ",
                style = MaterialTheme.typography.displayMedium
            )
            Text(
                text = stringResource(id = artworkCulture),
                style = MaterialTheme.typography.bodyLarge
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtWorkTopAppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
    ) {
        CenterAlignedTopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = stringResource(id = R.string.app_name),
                        style = MaterialTheme.typography.displaySmall,
                        modifier = Modifier
                            .padding(top = dimensionResource(id = R.dimen.padding_top_bar))
                    )
                }
            },
            modifier = Modifier,

        )
    }
}


@Preview(showBackground = true)
@Composable
fun ArtworkAppPreview() {
    _30DaysOfFamousArtworksTheme {
        ArtworkApp()
    }
}