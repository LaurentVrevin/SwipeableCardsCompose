
# Swipeable Cards with Jetpack Compose

Swipeable Cards is an Android application showcasing how to create an interactive stack of cards that can be swiped left or right using **Jetpack Compose**. This project demonstrates key Compose concepts such as animations, state management, and modern UI composition.

---

## 🎯 Features

- Stack of swipeable cards, similar to Tinder, allowing left and right swipes.
- Random background colors for each card.
- Counters at the top of the screen showing the number of left and right swipes.
- A "List empty" message displayed when no cards remain.
- Option to reset the card stack and start over.

---

## 🛠️ Technologies Used

- **Kotlin**: Primary programming language.
- **Jetpack Compose**: For building the modern, reactive UI.
- **Coroutines**: For managing animations.
- **Android Studio**: Development environment.

---

## 📷 Screenshot

https://github.com/user-attachments/assets/ec0faed6-3693-4a2b-be27-33252203a91a


---

## 🚀 Getting Started

### Prerequisites

- **Android Studio Arctic Fox (or newer)**.
- **Android SDK 21 (or newer)**.
- Internet connection to download Gradle dependencies.

### Instructions

1. Clone the GitHub repository:
   ```bash
   git clone https://github.com/your-username/SwipeableCardsCompose.git` 

2.  Open the project in **Android Studio**.
3.  Sync Gradle dependencies.
4.  Run the app on an emulator or a physical device.

----------

## 💡 How It Works

### Swipeable Card Stack

The cards are displayed as a stack, with the top card being the one currently visible. Each card can be swiped:

-   **Swipe Left**: The card is removed, and the left swipe counter increases.
-   **Swipe Right**: The card is removed, and the right swipe counter increases.

### Random Colors

Each card is assigned a random color when created, making the display dynamic and visually interesting.

### Empty State

When no cards are left in the stack, a **"List empty"** message is displayed in the center of the screen.

----------

## ✨ Future Enhancements

-   Add visual indicators for the swipe direction.
-   Allow users to customize the card colors or content.
-   Add unit tests to validate interactions.

----------

## 🤝 Contributing

Contributions are welcome! If you'd like to improve this project:

1.  Fork the repository.
2.  Create a new branch for your feature:
        
    `git checkout -b feature/new-feature` 
    
3.  Make your changes and commit them:
        
    `git commit -m "Add a new feature"` 
    
4.  Push your changes:
    
    `git push origin feature/new-feature` 
    
5.  Open a **pull request**.

----------

## 📄 License

This project is licensed under the MIT License. You are free to use, modify, and distribute this project. See the `LICENSE` file for more details.

----------

## 👤 Author

Laurent Vrevin -  [https://www.linkedin.com/in/laurentvrevin](https://www.linkedin.com/in/laurentvrevin)

----------

## 🌟 Acknowledgments

-   Thanks to the Android and Kotlin communities for their amazing resources and support! 🎉
