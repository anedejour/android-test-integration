import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.myapplication.InvestmentCard
import com.example.myapplication.NavigationItem
import org.junit.Rule
import org.junit.Test

class InvestmentCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    
    @Test
    fun investmentCard1DisplaysCorrectInfo() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Rendimento: R$ 0,09",
                amount = "R$ 11,52",
                date = "DAQUI A 2 DIAS"
            )
        }

        // Assert
        composeTestRule.onNodeWithText("MXRF11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rendimento: R\$ 0,09").assertIsDisplayed()
        composeTestRule.onNodeWithText("R\$ 11,52").assertIsDisplayed()
        composeTestRule.onNodeWithText("DAQUI A 2 DIAS").assertIsDisplayed()
        composeTestRule.onNodeWithText("Não está escrito em lugar algum").assertIsNotDisplayed()
    }

    @Test
    fun alertDisplaysOnMoreDetailsClick() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Rendimento: R$ 0,09",
                amount = "R$ 11,52",
                date = "DAQUI A 2 DIAS"
            )
        }

        // Executa clique no botão "Mais detalhes"
        composeTestRule.onNodeWithText("Mais detalhes").performClick()

        // Verifica se o título do alerta é exibido
        composeTestRule.onNodeWithText("Detalhes do investimento").assertIsDisplayed()

        composeTestRule.onNodeWithText("Aqui estão mais informações sobre o investimento.").assertIsDisplayed()
    }


    @Test
    fun investmentCard2DisplaysCorrectInfo() {
        composeTestRule.setContent {
            InvestmentCard(
                "VISC11",
                "Rendimento: R$ 0,80",
                "R$ 10,40",
                "DAQUI A 2 DIAS"
            )
        }

        composeTestRule.onNodeWithText("VISC11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rendimento: R\$ 0,80").assertIsDisplayed()
        composeTestRule.onNodeWithText("R$ 10,40").assertIsDisplayed()
        composeTestRule.onNodeWithText("DAQUI A 2 DIAS").assertIsDisplayed()
    }

    @Test
    fun alertDisplays2OnMoreDetailsClick() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                "VISC11",
                "Rendimento: R$ 0,80",
                "R$ 10,40",
                "DAQUI A 2 DIAS"
            )
        }
        composeTestRule.onNodeWithText("Mais detalhes").performClick()

        composeTestRule.onNodeWithText("Detalhes do investimento").assertIsDisplayed()
    }

    @Test
    fun investmentCard3DisplaysCorrectInfo() {
        composeTestRule.setContent {
            InvestmentCard(
                "RVBI11",
                "Rendimento: R$ 0,75",
                "R$ 18,75",
                "DAQUI A 3 DIAS"
            )
        }

        composeTestRule.onNodeWithText("RVBI11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rendimento: R\$ 0,75").assertIsDisplayed()
        composeTestRule.onNodeWithText("R\$ 18,75").assertIsDisplayed()
        composeTestRule.onNodeWithText("DAQUI A 3 DIAS").assertIsDisplayed()
    }

    @Test
    fun alertDisplays3OnMoreDetailsClick() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                "RVBI11",
                "Rendimento: R$ 0,75",
                "R$ 18,75",
                "DAQUI A 3 DIAS"
            )
        }
        composeTestRule.onNodeWithText("Mais detalhes").performClick()

        composeTestRule.onNodeWithText("Detalhes do investimento").assertIsDisplayed()
    }

    @Test
    fun investmentCard4DisplaysCorrectInfo() {
        composeTestRule.setContent {
            InvestmentCard(
                "CPTS11",
                "Rendimento: R$ 0,07",
                "R$ 2,95",
                "DAQUI A 5 DIAS"
            )
        }

        composeTestRule.onNodeWithText("CPTS11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rendimento: R\$ 0,07").assertIsDisplayed()
        composeTestRule.onNodeWithText("R\$ 2,95").assertIsDisplayed()
        composeTestRule.onNodeWithText("DAQUI A 5 DIAS").assertIsDisplayed()
    }

    @Test
    fun alertDisplays4OnMoreDetailsClick() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                "CPTS11",
                "Rendimento: R$ 0,07",
                "R$ 2,95",
                "DAQUI A 5 DIAS"
            )
        }
        composeTestRule.onNodeWithText("Mais detalhes").performClick()

        composeTestRule.onNodeWithText("Detalhes do investimento").assertIsDisplayed()
    }

    @Test
    fun investmentCard5DisplaysCorrectInfo() {
        composeTestRule.setContent {
            InvestmentCard(
                "MCHY11",
                "Rendimento: NÃO INFORMADO",
                "--",
                "NÃO INFORMADO"
            )
        }

        composeTestRule.onNodeWithText("MCHY11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rendimento: NÃO INFORMADO").assertIsDisplayed()
        composeTestRule.onNodeWithText("--").assertIsDisplayed()
        composeTestRule.onNodeWithText("NÃO INFORMADO").assertIsDisplayed()
    }

    @Test
    fun alertDisplays5OnMoreDetailsClick() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                "MCHY11",
                "Rendimento: NÃO INFORMADO",
                "--",
                "NÃO INFORMADO"
            )
        }
        composeTestRule.onNodeWithText("Mais detalhes").performClick()

        composeTestRule.onNodeWithText("Detalhes do investimento").assertIsDisplayed()
    }
}
