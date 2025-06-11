/**
 * 多言語挨拶を切り替えるスクリプト
 */
const greetings = ["こんにちは", "Hello", "Bonjour", "你好", "สวัสดี"];
let index = 0;

const h1 = document.getElementById("greeting");

setInterval(() => {
	h1.style.opacity = 0;

	setTimeout(() => {
		index = (index + 1) % greetings.length;
		h1.textContent = greetings[index];
		h1.style.opacity = 1;
	}, 1000);
}, 3000);

document.addEventListener("DOMContentLoaded", () => {
  const textEl = document.getElementById("animated-text");
  const text = textEl.textContent;
  textEl.textContent = ""; // 最初に空にする

  let i = 0;
  const interval = setInterval(() => {
    textEl.textContent += text[i];
    i++;
    if (i >= text.length) {
      clearInterval(interval);
    }
  }, 100); // 100ミリ秒ごとに1文字追加
});
