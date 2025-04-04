# Ignition Vector Icons Viewer

This is a simple Java application that allows you to view all available Vector Icons in the Inductive Automation Ignition SDK.

## How It Works

The key components:
1. Dependencies on the Ignition SDK libraries (specifically client-api and ignition-common)

## Setup Instructions

### Option 1: Using Gradle

1. Clone this repository
2. Open it in VS Code or your preferred IDE
3. Run the application using the provided Gradle task:
   ```
   ./gradlew run
   ```

## Expected Output

When run successfully, a dialog window will open showing all available Vector Icons in the Ignition framework, allowing
you to browse and select icons for your application.
Double click any icon to have the name of that icon copied to your clipboard, suitable for use in code via
`VectorIcons.get(name)`.