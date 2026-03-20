# jfx-tabbed-window

JavaFX と AtlantaFX を使用した、モダンな外観のタブ付きウィンドウアプリケーションです。

## 特徴

- **モダンな UI**: [AtlantaFX](https://github.com/mkpaz/atlantafx) を使用した美しいデザイン。
- **ダークモード対応**: [jSystemThemeDetector](https://github.com/Dansoftowner/jSystemThemeDetector) を使用し、OS のテーマ設定（ダーク/ライト）を起動時に自動検出し、適切なテーマを適用します。
- **タブ UI**: 上部にカスタムヘッダーバーを備えたタブインターフェース。
- **Java 25 対応**: 最新の Java バージョンと JavaFX を使用。

## 技術スタック

- **Java**: 25
- **JavaFX**: 25 (javafx-controls)
- **UI フレームワーク**: AtlantaFX (Primer テーマ)
- **ビルドツール**: Gradle
- **その他**: Lombok, jSystemThemeDetector

## 実行方法

以下のコマンドでアプリケーションを起動できます。

```bash
./gradlew run
```

## プロジェクト構造

- `src/main/java/com/echzny/tabbedwindow/Main.java`: アプリケーションのエントリーポイントおよび UI の構成。
