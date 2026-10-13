
package com.example.questlayout_0146

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questlayout_0146.ui.theme.QuestLayout_0146Theme

private val Cream = Color(0xFFF8F6F0)
private val Emerald = Color(0xFF00634F)
private val DeepGreen = Color(0xFF063D32)
private val Gold = Color(0xFFFFE7A0)

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Cream)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 60.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Teknologi Informasi",
                fontSize = 31.sp,
                fontWeight = FontWeight.Bold,
                color = DeepGreen,
                textAlign = TextAlign.Center,
                lineHeight = 35.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Universitas Muhammadiyah\nYogyakarta",
                fontSize = 19.sp,
                color = Color(0xFF304740),
                textAlign = TextAlign.Center,
                lineHeight = 25.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Emerald
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 5.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            horizontal = 14.dp,
                            vertical = 16.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Left section: UMY seal
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.umy_seal
                            ),
                            contentDescription = "UMY university seal",
                            modifier = Modifier.size(90.dp),
                            contentScale = ContentScale.Fit
                        )
                    }

                    // Middle section: gold divider
                    Box(
                        modifier = Modifier
                            .width(2.dp)
                            .height(125.dp)
                            .background(Gold.copy(alpha = 0.8f))
                    )

                    // Right section: university and department name
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Teknologi\nInformasi",
                                fontSize = 25.sp,
                                lineHeight = 29.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )

                            Spacer(
                                modifier = Modifier.height(8.dp)
                            )

                            Text(
                                text = "Universitas\nMuhammadiyah\nYogyakarta",
                                fontSize = 14.sp,
                                lineHeight = 18.sp,
                                fontWeight = FontWeight.Medium,
                                color = Gold,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }

        // Footer: aligned to the bottom of the outer Box
        Text(
            text = "© Universitas Muhammadiyah Yogyakarta",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(
                    start = 8.dp,
                    end = 8.dp,
                    bottom = 30.dp
                ),
            fontSize = 12.sp,
            color = DeepGreen,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ActivitasPertamaPreview() {
    QuestLayout_0146Theme {
        ActivitasPertama()
    }
}
